#include <iostream>
#include <omp.h>

using namespace std;

void merge(int *a, int l, int m, int r) {
  int i, j, k;
  int n1 = m - l + 1;
  int n2 = r - m;

  int *L = new int[n1];
  int *R = new int[n2];

  for (i = 0; i < n1; i++)
    L[i] = a[l + i];
  for (j = 0; j < n2; j++)
    R[j] = a[m + 1 + j];

  i = 0;
  j = 0;
  k = l;
  while (i < n1 && j < n2) {
    if (L[i] <= R[j]) {
      a[k] = L[i];
      i++;
    } else {
      a[k] = R[j];
      j++;
    }
    k++;
  }

  while (i < n1) {
    a[k] = L[i];
    i++;
    k++;
  }

  while (j < n2) {
    a[k] = R[j];
    j++;
    k++;
  }

  delete[] L;
  delete[] R;
}

void mergeSort(int *a, int l, int r) {
  if (l < r) {
    int m = l + (r - l) / 2;

    #pragma omp parallel sections
    {
      #pragma omp section
      {
        mergeSort(a, l, m);
      }

      #pragma omp section
      {
        mergeSort(a, m + 1, r);
      }
    }

    merge(a, l, m, r);
  }
}

int main() {
  int a[] = {5, 2, 8, 3, 1, 9, 4, 7, 6};
  int n = sizeof(a) / sizeof(a[0]);

  mergeSort(a, 0, n - 1);

  cout << "Sorted array: ";
  for (int i = 0; i < n; i++)
    cout << a[i] << " ";
  cout << endl;

  return 0;
}